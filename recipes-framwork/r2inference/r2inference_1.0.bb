SUMMARY = "RidgeRun's Inference Library"
DESCRIPTION = "A machine learning library for easy inference integration"
HOMEPAGE = "https://developer.ridgerun.com/wiki/index.php?title=R2Inference"
SECTION = "multimedia"
LICENSE = "LGPL2.1"

LIC_FILES_CHKSUM = "file://COPYING;md5=a079f37f0484c6a88e7b23a94d6326c5"

DEPENDS = "glib-2.0 tensorflow-lite flatbuffers neuropilot-bin"

SRCBRANCH ?= "main"
SRCREV = "19c52c45b7d2089223e8d04e8be7d87b7e88cf71"
SRC_URI = "${AIOT_RITY_URI}/r2inference.git;protocol=ssh;branch=${SRCBRANCH}"

EXTRA_OEMESON += " -Denable-tflite=true -Denable-neuronrt=true -Denable-tests=disabled -Denable-docs=disabled "

S = "${WORKDIR}/git"

FILES:${PN} += "${libdir}/libr2inference.so"

inherit meson pkgconfig 
