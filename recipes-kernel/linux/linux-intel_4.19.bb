require linux-intel.inc

KBRANCH = "4.19/base"
KMETA_BRANCH = "yocto-4.19"

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRC_URI_append = " file://0001-menuconfig-mconf-cfg-Allow-specification-of-ncurses-.patch"

DEPENDS += "elfutils-native openssl-native util-linux-native"

LINUX_VERSION ?= "4.19.0"
SRCREV_machine ?= "a13be70e5ba050d848fc4005add46ca89bb8e6e6"
SRCREV_meta ?= "26bfb042ebb6e4816c5a8ce85d97a55e763430c7"

# For Crystalforest and Romley
KERNEL_MODULE_AUTOLOAD_append_core2-32-intel-common = " uio"
KERNEL_MODULE_AUTOLOAD_append_corei7-64-intel-common = " uio"

# Functionality flags
KERNEL_EXTRA_FEATURES ?= "features/netfilter/netfilter.scc features/security/security.scc"