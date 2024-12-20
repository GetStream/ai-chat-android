/*
 * Designed and developed by 2024 skydoves (Jaewoong Eum)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
  id("skydoves.android.library")
  id("skydoves.android.library.compose")
  id("skydoves.android.hilt")
  id(libs.plugins.kotlin.serialization.get().pluginId)
  id("skydoves.spotless")
}

android {
  namespace = "io.getstream.ai.chat.core.navigation"
}

dependencies {
  implementation(projects.core.designsystem)
  api(projects.core.model)

  implementation(libs.kotlinx.coroutines.android)
  api(libs.androidx.navigation.compose)

  // Serialization
  implementation(libs.kotlinx.serialization.json)
}
