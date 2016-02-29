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
if exist SecureSCADA\doneS.class del SecureSCADA\doneS.class
if exist SecureSCADA\approved.class del SecureSCADA\approved.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist SecureSCADA\checkingRights.class del SecureSCADA\checkingRights.class
if exist SecureSCADA\Rights.class del SecureSCADA\Rights.class
if exist SecureSCADA\Network.class del SecureSCADA\Network.class
if exist SecureSCADA\access.class del SecureSCADA\access.class
if exist SecureSCADA\login.class del SecureSCADA\login.class
if exist SecureSCADA\FieldService.class del SecureSCADA\FieldService.class
if exist SecureSCADA\HMI.class del SecureSCADA\HMI.class
if exist SecureSCADA\sendTaskToDataserver.class del SecureSCADA\sendTaskToDataserver.class
if exist SecureSCADA\toLogin.class del SecureSCADA\toLogin.class
if exist SecureSCADA\rejectedRights.class del SecureSCADA\rejectedRights.class
if exist SecureSCADA\notOk.class del SecureSCADA\notOk.class
if exist SecureSCADA\FieldUnit.class del SecureSCADA\FieldUnit.class
if exist SecureSCADA\ok.class del SecureSCADA\ok.class
if exist SecureSCADA\sendToField.class del SecureSCADA\sendToField.class
if exist SecureSCADA\LocalController.class del SecureSCADA\LocalController.class
if exist SecureSCADA\rejected.class del SecureSCADA\rejected.class
if exist SecureSCADA\Securitypolicy.class del SecureSCADA\Securitypolicy.class
if exist SecureSCADA\CenterController.class del SecureSCADA\CenterController.class
if exist SecureSCADA\requestTask.class del SecureSCADA\requestTask.class
if exist SecureSCADA\queryData.class del SecureSCADA\queryData.class
if exist SecureSCADA\SecureSCADA_pkgClass.class del SecureSCADA\SecureSCADA_pkgClass.class
if exist SecureSCADA\DataServer.class del SecureSCADA\DataServer.class
if exist SecureSCADA\checkLogin.class del SecureSCADA\checkLogin.class
if exist SecureSCADA\doneService.class del SecureSCADA\doneService.class
if exist SecureSCADA\checkPolicy.class del SecureSCADA\checkPolicy.class
if exist SecureSCADA\signin.class del SecureSCADA\signin.class
if exist SecureSCADA\sendTaskToField.class del SecureSCADA\sendTaskToField.class
if exist SecureSCADA\checkRight.class del SecureSCADA\checkRight.class
if exist SecureSCADA\allow.class del SecureSCADA\allow.class
if exist SecureSCADA\Checkpoint.class del SecureSCADA\Checkpoint.class
if exist SecureSCADA\refusedTask.class del SecureSCADA\refusedTask.class
if exist SecureSCADA\notAllow.class del SecureSCADA\notAllow.class
if exist SecureSCADA\requestService.class del SecureSCADA\requestService.class
if exist SecureSCADA\connecttoNet.class del SecureSCADA\connecttoNet.class
if exist SecureSCADA\sendTask.class del SecureSCADA\sendTask.class
if exist SecureSCADA\backRights.class del SecureSCADA\backRights.class
if exist SecureSCADA\SingleAccessPoint.class del SecureSCADA\SingleAccessPoint.class
if exist SecureSCADA\approvedTask.class del SecureSCADA\approvedTask.class
if exist SecureSCADA\sendtoSingleLogin.class del SecureSCADA\sendtoSingleLogin.class

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


