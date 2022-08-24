FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

MACHINE_CHECK = "${@oe.utils.conditional('MACHINE', 'i1200-demo', "${@oe.utils.conditional('NDA_BUILD', 1, true, false , d)}" ,false ,d)}"

SRC_URI += "${@oe.utils.conditional('MACHINE_CHECK', 'true', 'file://0001-add-support-for-neuron-runtime.patch', ' ', d)}"

