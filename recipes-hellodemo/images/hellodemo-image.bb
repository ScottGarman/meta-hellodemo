DESCRIPTION = "Demonstration image to show how to start up an application \
when Xorg starts. It is based on core-image-sato."

IMAGE_FEATURES += "splash package-management x11-base x11-sato ssh-server-dropbear"

LICENSE = "MIT"

inherit core-image

# When customizing an image recipe, always make sure you append to
# IMAGE_INSTALL *after* the inherit line, otherwise the IMAGE_INSTALL
# variable will get reset and your modifications will not be included.
IMAGE_INSTALL += "hello xterm demo-autostart psplash"

# Nah, we don't need games, so just comment this out:
#IMAGE_INSTALL += "packagegroup-core-x11-sato-games"
