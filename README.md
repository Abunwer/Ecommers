# Ecommers


for solvin maven problems 

change gloable setting by

open {maveroot}/conf/setting.xml

change the localrepsotory path 

<localRepository>/add/your/path/here</localRepository>

save the file and close 

create user setting by 
open home/{username}/.m2/
create setting.xml file 
and 
copy the follwing inside it and change local Repository path

<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">
  <localRepository><add/your/path></localRepository>
  <interactiveMode/>
  <usePluginRegistry/>
  <offline/>
  <pluginGroups/>
  <servers/>
  <mirrors/>
  <proxies/>
  <profiles/>
  <activeProfiles/>
</settings>


then save and close

