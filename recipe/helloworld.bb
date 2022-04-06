SUMMARY = "A Simple Yocto recipe for helloworld app"
DESCRIPTION = " A simple yet complete recipe that uses cmake for building \
	a helloworld app in C++"
HOMEPAGE = "https://github.com/joseinweb/helloworld"

LICENSE = "Apache License 2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

PV = "1.0"

SRC_URI = "file://README.md \
	   file://LICENSE \
	   file://src/* \
           "

SECTION = "apps"

S = "${WORKDIR}/src"

inherit cmake

EXTRA_OECMAKE += " "

