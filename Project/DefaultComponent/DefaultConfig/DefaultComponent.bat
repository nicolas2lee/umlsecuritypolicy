echo off

set RHAP_JARS_DIR=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=Animation   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist SCADA\ok.class del SCADA\ok.class
if exist SCADA\SCADA_pkgClass.class del SCADA\SCADA_pkgClass.class
if exist SCADA\HMI.class del SCADA\HMI.class
if exist SCADA\CenterController.class del SCADA\CenterController.class
if exist SCADA\checkingRights.class del SCADA\checkingRights.class
if exist SCADA\queryData.class del SCADA\queryData.class
if exist SCADA\notAllow.class del SCADA\notAllow.class
if exist SCADA\access.class del SCADA\access.class
if exist SCADA\FieldService.class del SCADA\FieldService.class
if exist SCADA\FieldUnit.class del SCADA\FieldUnit.class
if exist SCADA\Network.class del SCADA\Network.class
if exist SCADA\sendtoSingleLogin.class del SCADA\sendtoSingleLogin.class
if exist SCADA\login.class del SCADA\login.class
if exist SCADA\sendToField.class del SCADA\sendToField.class
if exist SCADA\notOk.class del SCADA\notOk.class
if exist SCADA\signin.class del SCADA\signin.class
if exist SCADA\approved.class del SCADA\approved.class
if exist SCADA\checkLogin.class del SCADA\checkLogin.class
if exist SCADA\Securitypolicy.class del SCADA\Securitypolicy.class
if exist SCADA\DataServer.class del SCADA\DataServer.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist SCADA\sendTask.class del SCADA\sendTask.class
if exist SCADA\Checkpoint.class del SCADA\Checkpoint.class
if exist SCADA\rejected.class del SCADA\rejected.class
if exist SCADA\checkPolicy.class del SCADA\checkPolicy.class
if exist SCADA\checkRight.class del SCADA\checkRight.class
if exist SCADA\SingleAccessPoint.class del SCADA\SingleAccessPoint.class
if exist SCADA\toLogin.class del SCADA\toLogin.class
if exist SCADA\allow.class del SCADA\allow.class
if exist SCADA\Rights.class del SCADA\Rights.class
if exist SCADA\LocalController.class del SCADA\LocalController.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


