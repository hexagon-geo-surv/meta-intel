require linux-intel.inc

KBRANCH = "4.19/base"
KMETA_BRANCH = "yocto-4.19"

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRC_URI_append = " file://0001-menuconfig-mconf-cfg-Allow-specification-of-ncurses-.patch"

DEPENDS += "elfutils-native openssl-native util-linux-native"

LINUX_VERSION ?= "4.19.8"
SRCREV_machine ?= "860b7009ed14bad9650f26d8d7ded82152b96368"
SRCREV_meta ?= "ced14887c323f1cb6b3befe2b29e471e8fee1bc6"

# For Crystalforest and Romley
KERNEL_MODULE_AUTOLOAD_append_core2-32-intel-common = " uio"
KERNEL_MODULE_AUTOLOAD_append_corei7-64-intel-common = " uio"

# Functionality flags
KERNEL_EXTRA_FEATURES ?= "features/netfilter/netfilter.scc features/security/security.scc"
