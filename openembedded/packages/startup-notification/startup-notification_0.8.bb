DESCRIPTION = "Startup notification support"
LICENSE = "LGPL"
SECTION = "libs"
PRIORITY = "optional"
MAINTAINER = "Phil Blundell <pb@nexus.co.uk>"
DEPENDS = "libx11"
PR = "r1"

inherit autotools pkgconfig 

SRC_URI = "http://www.freedesktop.org/software/startup-notification/releases/startup-notification-0.8.tar.gz"

do_configure_prepend () {
        export X_LIBS=" -L${STAGING_LIBDIR}"
}

do_stage () {
	oe_runmake install DESTDIR="" bindir=${STAGING_BINDIR} includedir=${STAGING_INCDIR} libdir=${STAGING_LIBDIR} prefix=${STAGING_DIR}
}
