DESCRIPTION = "A C++ library for geographic projections."
SECTION = "libs"
PRIORITY = "optional"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/GeographicLib-${PV}/LICENSE.txt;md5=11fd331b707f0de15b3485b93dfacc82"

SRC_URI[md5sum] = "e73a703da71380bd6bfd2d6eab75e0a4"
SRC_URI[sha1sum] = "ed6605092951f28567477e52b3422b800bb6a827"

SRC_URI = "${SOURCEFORGE_MIRROR}/geographiclib/GeographicLib-${PV}.tar.gz"


inherit cmake

OECMAKE_SOURCEPATH = " ${WORKDIR}/GeographicLib-${PV}"

FILES_${PN}-cmake = " \
	/usr/lib/cmake/GeographicLib/geographiclib-*.cmake \
"

FILES_${PN}-python = " \
	/usr/lib/python/site-packages/geographiclib/*.py \
	/usr/lib/python/site-packages/geographiclib/test/*.py \
"

FILES_${PN}-nodejs = " \
	/usr/lib/node_modules/geographiclib/package.json \
	/usr/lib/node_modules/geographiclib/*.js \
	/usr/lib/node_modules/geographiclib/README.md \
	/usr/lib/node_modules/geographiclib/LICENSE.txt \
	/usr/lib/node_modules/geographiclib/src/*.js \
	/usr/lib/node_modules/geographiclib/test/*.js \
"

FILES_${PN}-matlab = " \ 
	/usr/share/matlab/geographiclib/*.m \
	/usr/share/matlab/geographiclib/private/*.m \
	/usr/share/matlab/geographiclib-legacy/*.m \
"

PACKAGES =+ "${PN}-cmake ${PN}-python ${PN}-nodejs ${PN}-matlab"


