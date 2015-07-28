/*
 * Copyright 2014 Stephan Fellhofer
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

package org.catrobat.jira.adminhelper.activeobject;

import net.java.ao.Entity;
import net.java.ao.OneToMany;
import net.java.ao.Preload;

@Preload
public interface AdminHelperConfig extends Entity {
    String getPublicGithubApiToken();

    void setPublicGithubApiToken(String publicGithubApiToken);

    String getGithubApiToken();

    void setGithubApiToken(String githubApiToken);

    String getGithubOrganisation();

    void setGithubOrganisation(String githubOrganisation);

    long getUserDirectoryId();

    void setUserDirectoryId(long userDirectoryId);

    int getDefaultGithubTeamId();

    void setDefaultGithubTeamId(int defaultGithubTeamId);

    String getMailFromName();

    void setMailFromName(String fromName);

    String getMailFrom();

    void setMailFrom(String from);

    String getMailSubject();

    void setMailSubject(String subject);

    String getMailBody();

    void setMailBody(String body);

    @OneToMany(reverse = "getConfiguration")
    Resource[] getResources();

    @OneToMany(reverse = "getConfiguration")
    ApprovedGroup[] getApprovedGroups();

    @OneToMany(reverse = "getConfiguration")
    ApprovedUser[] getApprovedUsers();

    @OneToMany(reverse = "getConfiguration")
    Team[] getTeams();
}
