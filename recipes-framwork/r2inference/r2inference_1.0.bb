SUMMARY = "RidgeRun's Inference Library"
DESCRIPTION = "A machine learning library for easy inference integration"
HOMEPAGE = "https://developer.ridgerun.com/wiki/index.php?title=R2Inference"
SECTION = "multimedia"
LICENSE = "LGPL2.1"

LIC_FILES_CHKSUM = "file://COPYING;md5=a079f37f0484c6a88e7b23a94d6326c5"


DEPENDS = "glib-2.0 tensorflow-lite flatbuffers"

SRCBRANCH ?= "main"
SRCREV = "ecc6b74bda2c4d4076823f66dd99d68979975c00"
SRC_URI = "git://gitlab.com/mediatek/aiot/team-mtk-aiot-sw-ss2/r2inference.git;protocol=https;branch=${SRCBRANCH}"

EXTRA_OEMESON += " -Denable-tflite=true -Denable-tests=disabled -Denable-docs=disabled "

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/libr2inference.so"

inherit meson pkgconfig 
