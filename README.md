# OriginalRoutingPatched

### Instructions in order to apply patch and compile the code:

From terminal:
```
svn checkout svn://svn.code.sf.net/p/jmt/code/trunk jmt
cd jmt
curl https://raw.githubusercontent.com/jmt-improved/OriginalRoutingPatched/master/jmt_patch > jmt_patch
patch -p0 < jmt_patch
mvn clean install
```

### Instructions for debugging and testing the code with IntelliJ IDEA:
* Import maven project in the IDE
* Create a new run configuration in ```Run->Edit Configurations..``` as Java Application with Main class set to ```jmt.gui.jsimgraph.mainGui.MainWindow```
