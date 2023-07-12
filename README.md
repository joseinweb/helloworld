# helloworld
A simple but complete recipe for yocto build environment

Just copy the folder into any meta layers and run bitbake hellworld.

devtool add --autorev helloworld "https://github.com/joseinweb/helloworld.git;branch=main" && devtool build helloworld
