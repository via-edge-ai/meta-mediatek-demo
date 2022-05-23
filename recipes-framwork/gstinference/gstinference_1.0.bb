SUMMARY = "GstInference"
DESCRIPTION = "A GStreamer deep learning inference framework"
HOMEPAGE = "https://developer.ridgerun.com/wiki/index.php?title=GstInference"
SECTION = "multimedia"
LICENSE = "LGPL2.1"

LIC_FILES_CHKSUM = "file://COPYING;md5=b5ec61ada91a1aad4812666edfd8c57e"

DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base r2inference opencv"

SRCBRANCH ?= "main"
SRCREV = "62b49f4c4ee09827cf52159e8b3d45074f3bc497"
SRC_URI = "git://gitlab.com/mediatek/aiot/team-mtk-aiot-sw-ss2/gst-inference.git;protocol=https;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

do_install:append() {
    install -d ${D}${datadir}/gstinference_example
    install -d ${D}${datadir}/gstinference_example/object_detection
    install -d ${D}${datadir}/gstinference_example/image_classification
    install -m 644 ${S}/gstinference_example/object_detection/* ${D}${datadir}/gstinference_example/object_detection
    install -m 644 ${S}/gstinference_example/image_classification/* ${D}${datadir}/gstinference_example/image_classification
}

FILES:${PN} += "${libdir}/gstreamer-1.0/libgstinferenceoverlayplugin.so"
FILES:${PN} += "${libdir}/gstreamer-1.0/libgstinference.so"

FILES:${PN} += "${datadir}/*"
inherit meson pkgconfig
