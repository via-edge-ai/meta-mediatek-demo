SUMMARY = "RidgeRun's Inference Library"
DESCRIPTION = "A machine learning library for easy inference integration"
HOMEPAGE = "https://developer.ridgerun.com/wiki/index.php?title=R2Inference"
SECTION = "multimedia"
LICENSE = "LGPL2.1"

LIC_FILES_CHKSUM = "file://COPYING;md5=a079f37f0484c6a88e7b23a94d6326c5"

DEPENDS = "glib-2.0 tensorflow-lite flatbuffers"
SRCBRANCH ?= "main"
SRCREV = "02fd3e8cfad00f4d93c2772bfb64ceca4268fe79"
SRC_URI = "${AIOT_RITY_URI}/r2inference.git;protocol=ssh;branch=${SRCBRANCH}"

EXTRA_OEMESON += " -Denable-tflite=true -Denable-tests=disabled -Denable-docs=disabled "

S = "${WORKDIR}/git"

FILES:${PN} += "${libdir}/libr2inference.so"

inherit meson pkgconfig 
