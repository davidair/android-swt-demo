android-swt-demo
================

A prototype that demonstrates how to display and Android custom-painted view using desktop Java and SWT

This prototype consists of two projects:

DrawIt - a very simple Android application which contains one custom-painted view (TestView)

AndroidPaint - a desktop SWT Java application that contains a very crude prototype of a framework that would allow
rendering Android views using SWT. It references TestView.js from the DrawIt project - so exactly the same code
runs on both Android and desktop (the link is a full path to my local instance and needs to be changed in the
project file)

Screenshots
===========

Rendered via SWT:

![Android via SWT](https://raw.github.com/davidair/android-swt-demo/master/android_swt.png)

Rendered on Android:

![Native Android](https://raw.github.com/davidair/android-swt-demo/master/android_paint.png)
