DESCRIPTION = "Support library for dealing with zip files"
SECTION = "libs"
PRIORITY = "optional"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=55ca817ccb7d5b5b66355690e9abc605"
DEPENDS = "zlib"

PR = "r0"

SRC_URI[md5sum] = "df52161252aa17031bca82e2fd381a14"
SRC_URI[sha256sum] = "846246d7cdeee405d8d21e2922c6e97f55f24ecbe3b6dcf5778073a88f120544"

SRC_URI = "https://github.com/gdraheim/zziplib/archive/v${PV}.tar.gz"

inherit autotools pkgconfig

EXTRA_OECONF = "--with-zlib"
