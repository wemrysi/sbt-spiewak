/*
 * Copyright 2018 Daniel Spiewak
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

name := "sbt-spiewak"

baseVersion := "0.1"

bintrayVcsUrl := Some("git@github.com:djspiewak/sbt-spiewak.git")

sbtPlugin := true

sbtVersion in Global := {
  scalaBinaryVersion.value match {
    case "2.10" => "0.13.16"
    case "2.12" => "1.1.1"
  }
}

addSbtPlugin("io.get-coursier"   % "sbt-coursier" % "1.1.0-M1")
addSbtPlugin("com.dwijnand"      % "sbt-travisci" % "1.1.1")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"      % "0.9.3")
addSbtPlugin("de.heikoseeberger" % "sbt-header"   % "5.0.0")

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"     % "1.1.1")

pgpSecretRing := pgpPublicRing.value   // workaround for sbt/sbt-pgp#126
useGpg := true,
