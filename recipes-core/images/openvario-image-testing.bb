require openvario-base-image.bb

#IMAGE_ROOTFS_SIZE ?= "3768320"
IMAGE_ROOTFS_SIZE ?= "1048576"

IMAGE_INSTALL += "\
    xcsoar-testing \
    xcsoar-menu \
    xcsoar-profiles \
    xcsoar-maps-alps \
    xcsoar-maps-default \
    sensord-testing\
    variod-testing \
    ovmenu-ng \
    openvario-autologin \
    lk8000 \
    lk8000-dbg \
    packagegroup-core-tools-debug \
"

export IMAGE_BASENAME = "openvario-image-testing"
