/*
 * Copyright 2015 - Patrick J - ps-app
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pddstudio.earthviewer.views.about;

import android.os.AsyncTask;

import com.mikepenz.aboutlibraries.LibsFragmentCompat;

/**
 * This Class was created by Patrick J
 * on 13.12.15. For more Details and Licensing
 * have a look at the README.md
 */
public class AboutFragmentCompat extends LibsFragmentCompat {

    public AboutFragmentCompat() {
        super();
    }

    @Override
    protected void executeLibTask(LibsFragmentCompat.LibraryTask libraryTask) {
        if(libraryTask != null) {
            libraryTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        }

    }


}
