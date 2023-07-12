# helloworld
A simple but complete recipe for yocto build environment

You can use this in two ways 
1. checkout the whole repo into any meta layer (say in recipes-extended directory) and run
   ```
   bitbake helloworld
   ```
2. Checkout using devtool 
```
devtool add --autorev helloworld https://github.com/joseinweb/helloworld.git --src-subdir src --srcbranch main && devtool build helloworld
```
