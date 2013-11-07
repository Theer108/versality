==================
Versality - README
==================

How to setup AndEngine
======================
1. Create empty workspace or try working on existing workspace with our project (probably recommended)
2. File > Import > Projects from Git
3. URI: https://github.com/RealMayo/AndEngine.git
4. Next, next, next, next...
5. Right click on AndEngine project, select Properties
6. Select Android and check "Is Library" and click Apply
7. Select Java Build Path and check everything in "Order and export" tab.

Now, there shouldn't be any errors with AndEngine.
You just need to import somehow our project and:

1. Right click on it, select properties
2. Select Android and in "Library" frame click Add and select AndEngine
3. Apply
4. In Java Build Path, select everything in "Order and export"

Try running our state-of-the-art game :D

Setting up your phone
=====================

Android Debug Bridge (ADB) is located in downloaded ADT under sdk/platform-tools

Instructions for Linux (Debian Wheezy):
1. Plug in your phone 
2. Turn on debug mode or sth similar on your phone
3. cd to sdk/platform-tools
4. ./adb devices
5. If there is your device listed then go to 7d
6. If there is nothing - Google
7. If there is a line "no permission" then:
   a) ./adb kill-server
   b) sudo ./adb start-server
   c) ./adb devices
   d) In eclipse in Run configuration change settings to prompt for devices every time 
      or if you're lucky check to always run on your phone
8. Code!

Where to learn AndEngine
========================

1. Here http://www.matim-dev.com/tutorials.html
2. This point is for 1 not to feel lonely

Troubleshooting
===============

1. No graphics acceleration detected, game crashes - in Virtual Device properties window, check "use host GPU"