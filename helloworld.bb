SUMMARY = "A Simple Yocto recipe for helloworld app"
DESCRIPTION = " A simple yet complete recipe that uses cmake for building \
        a helloworld app in C++"
HOMEPAGE = "https://github.com/joseinweb/helloworld"
SECTION = "apps"
LICENSE = "Apache License 2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

PV = "1.0"
SRC_URI = "git://github.com/joseinweb/helloworld.git;protocol=https;nobranch=1"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/src"

inherit cmake
EXTRA_OECMAKE += " "

