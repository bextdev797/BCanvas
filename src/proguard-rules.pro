# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.bcanvas.BCanvas {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/bcanvas/repack'
-flattenpackagehierarchy
-dontpreverify
