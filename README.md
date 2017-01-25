# TimeAgo [ ![Download](https://api.bintray.com/packages/chathurahettiarachchi/maven/TimeZAgo/images/download.svg?version=1.1.7) ](https://bintray.com/chathurahettiarachchi/maven/TimeZAgo/1.1.7/link)

I know what is mostly experianced problem when doing my development. So I decide to write this library to get how much time passed. Many of us having problem how to show how much time have passed, how to show it like in messages, notifications... Yeah, you looking at the right place. This will fix your issue.

  ![logo](https://cloud.githubusercontent.com/assets/13764097/15270717/a196efe4-1a46-11e6-9fbe-5559614af3dd.png)
  
####Let's take a look how to add this to your project

For the android project just include the following dependency inside you buil.gradle's depedency list.

Gradle
------
```
repositories {
  jcenter()
}

dependencies {
    ...
    compile 'com.chootdev:timezago:1.1.7'
}
```

if you using maven use following
Maven
------
```
<dependency>
  <groupId>com.chootdev</groupId>
  <artifactId>timezago</artifactId>
  <version>1.1.7</version>
  <type>pom</type>
</dependency>
```
  
After setup installing lib to your project you just need only to calls it using just two lines of code. It will return you a string with the resuls.

Usage
-----
```java
TimeAgo timeAgo = new TimeAgo();
String result = timeAgo.getTimeAgo(YOUR_PAST_DATE);
```

```java
TimeAgo timeAgo = new TimeAgo().locale(CONTEXT).with(CUSTOM_DATE_FORMAT);
String result = timeAgo.getTimeAgo(YOUR_CUSTOM_PAST_DATE);
```

Limitations
-----------
* Currently not supporting for custom date formats. supports for ISO foramt and dd/MM/yyyy HH:mm:ss only.
* Some parts like reducing time from your input date need to manage by you, and i was planning to add those line in future too.

Output patterns
---------------
* Below 1min  - just now
* 1min - 1h   - returns like 20min
* 1h - 24h    - time eg: 12.34pm
* 1d - 1w     - 1 week ago
* 1w - 4w     - 1 week ago, 2 weeks ago 3 weeks ago
* 1m >        - date

Screenshot
----------
![src](https://cloud.githubusercontent.com/assets/13764097/15270846/684460f0-1a4b-11e6-801d-62cda0b44752.png)
  
Changelog
---------
* **1.1.7**
    * Added ru localization, changed min API from 16 to 9, custom date format
* **1.1.6**
    * Fixed grammer issues
* **1.1.5**
    * Stable the release
* **1.1.0**
    * Fixed crashing for ISO date format
* **1.0.0**
    * Initial release

## Author

Chathura Hettiarachchi, chathura93@yahoo.com

# License
Copyright 2016 Chathura Hettiarachchi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
