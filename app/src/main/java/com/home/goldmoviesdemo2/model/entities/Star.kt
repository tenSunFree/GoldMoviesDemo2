package com.home.goldmoviesdemo2.model.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.home.goldmoviesdemo2.model.License
import com.home.goldmoviesdemo2.model.Owner
import kotlinx.android.parcel.Parcelize

/**
 * @Embedded: 支持數據庫表Java對象通過註解符@Embedded內嵌一個Java對象
 * @prefix = (""): 使用前綴來避免嵌入式類和所有者類之間可能存在相鄰名稱的重複
 */
@Parcelize
@Entity
data class Star(
    @ColumnInfo(name = "page")
    var page: Int = 0,
    @SerializedName("id")
    @field:PrimaryKey(autoGenerate = true) var id: Int = 0,
    @SerializedName("node_id")
    var node_id: String = "",
    @SerializedName("name")
    var name: String = "",
    @SerializedName("full_name")
    var fullName: String = "",
    @SerializedName("private")
    var private: Boolean = false,
    @SerializedName("owner")
    @Embedded(prefix = "owner_") var owner: Owner? = Owner(),
    @SerializedName("html_url")
    var htmlUrl: String = "",
    @SerializedName("description")
    var description: String = "",
    @SerializedName("fork")
    var fork: Boolean = false,
    @SerializedName("url")
    var url: String = "",
    @SerializedName("forks_url")
    var forksUrl: String = "",
    @SerializedName("keys_url")
    var keysUrl: String = "",
    @SerializedName("collaborators_url")
    var collaboratorsUrl: String = "",
    @SerializedName("teams_url")
    var teamsUrl: String = "",
    @SerializedName("hooks_url")
    var hooksUrl: String = "",
    @SerializedName("issue_events_url")
    var issueEventsUrl: String = "",
    @SerializedName("events_url")
    var eventsUrl: String = "",
    @SerializedName("assignees_url")
    var assigneesUrl: String = "",
    @SerializedName("branches_url")
    var branchesUrl: String = "",
    @SerializedName("tags_url")
    var tagsUrl: String = "",
    @SerializedName("blobs_url")
    var blobsUrl: String = "",
    @SerializedName("git_tags_url")
    var gitTagsUrl: String = "",
    @SerializedName("git_refs_url")
    var gitRefsUrl: String = "",
    @SerializedName("trees_url")
    var treesUrl: String = "",
    @SerializedName("statuses_url")
    var statusesUrl: String = "",
    @SerializedName("languages_url")
    var languagesUrl: String = "",
    @SerializedName("stargazers_url")
    var stargazersUrl: String = "",
    @SerializedName("contributors_url")
    var contributorsUrl: String = "",
    @SerializedName("subscribers_url")
    var subscribersUrl: String = "",
    @SerializedName("subscription_url")
    var subscriptionUrl: String = "",
    @SerializedName("commits_url")
    var commitsUrl: String = "",
    @SerializedName("git_commits_url")
    var gitCommitsUrl: String = "",
    @SerializedName("comments_url")
    var commentsUrl: String = "",
    @SerializedName("issue_comment_url")
    var issueCommentUrl: String = "",
    @SerializedName("contents_url")
    var contentsUrl: String = "",
    @SerializedName("compare_url")
    var compareUrl: String = "",
    @SerializedName("merges_url")
    var mergesUrl: String = "",
    @SerializedName("archive_url")
    var archiveUrl: String = "",
    @SerializedName("downloads_url")
    var downloadsUrl: String = "",
    @SerializedName("issues_url")
    var issuesUrl: String = "",
    @SerializedName("pulls_url")
    var pullsUrl: String = "",
    @SerializedName("milestones_url")
    var milestonesUrl: String = "",
    @SerializedName("notifications_url")
    var notificationsUrl: String = "",
    @SerializedName("labels_url")
    var labelsUrl: String = "",
    @SerializedName("releases_url")
    var releasesUrl: String = "",
    @SerializedName("deployments_url")
    var deploymentsUrl: String = "",
    @SerializedName("created_at")
    var createdAt: String = "",
    @SerializedName("updated_at")
    var updatedAt: String = "",
    @SerializedName("pushed_at")
    var pushedAt: String = "",
    @SerializedName("git_url")
    var gitUrl: String = "",
    @SerializedName("ssh_url")
    var sshUrl: String = "",
    @SerializedName("clone_url")
    var cloneUrl: String = "",
    @SerializedName("svn_url")
    var svnUrl: String = "",
    @SerializedName("homepage")
    var homepage: String = "",
    @SerializedName("size")
    var size: Int = 0,
    @SerializedName("stargazers_count")
    var stargazersCount: Int = 0,
    @SerializedName("watchers_count")
    var watchersCount: Int = 0,
    @SerializedName("language")
    var language: String = "",
    @SerializedName("has_issues")
    var hasIssues: Boolean = false,
    @SerializedName("has_projects")
    var hasProjects: Boolean = false,
    @SerializedName("has_downloads")
    var hasDownloads: Boolean = false,
    @SerializedName("has_wiki")
    var hasWiki: Boolean = false,
    @SerializedName("has_pages")
    var hasPages: Boolean = false,
    @SerializedName("forks_count")
    var forksCount: Int = 0,
    @SerializedName("mirror_url")
    var mirrorUrl: String = "",
    @SerializedName("archived")
    var archived: Boolean = false,
    @SerializedName("disabled")
    var disabled: Boolean = false,
    @SerializedName("open_issues_count")
    var openIssuesCount: Int = 0,
    @SerializedName("license")
    @Embedded(prefix = "license_") var license: License? = License(),
    @SerializedName("forks")
    var forks: Int = 0,
    @SerializedName("open_issues")
    var openIssues: Int = 0,
    @SerializedName("watchers")
    var watchers: Int = 0,
    @SerializedName("default_branch")
    var defaultBranch: String = "",
    @SerializedName("score")
    var score: Int = 0
) : Parcelable