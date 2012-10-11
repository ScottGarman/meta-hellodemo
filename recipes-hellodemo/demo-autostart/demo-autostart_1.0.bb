DESCRIPTION = "Custom matchbox session file to auto-start the GNU helloworld app on startup."
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://../COPYING;md5=3da9cfbcb788c80a0384361b4de20420"
PR = "r0"

SRC_URI = "file://COPYING \
           file://session"

do_install () {
	mkdir -p ${D}/home/root/.matchbox
	cp ${WORKDIR}/session ${D}/home/root/.matchbox/
}

# By default /home doesn't get included in the FILES defaults, so we
# must explicitly include it into the main package:
FILES_${PN} = "/home/root/.matchbox/"
