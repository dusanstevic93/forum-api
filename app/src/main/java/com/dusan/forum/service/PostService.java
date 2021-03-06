package com.dusan.forum.service;

import org.springframework.hateoas.PagedModel;

import com.dusan.forum.request.PostRequest;
import com.dusan.forum.response.PostResponse;

public interface PostService {

	void createPost(long topicId, long parentId, String username, PostRequest createPostRequest);

	PostResponse getPost(long postId);

	void deleteAnyPost(long postId);
	
	void deleteUserPost(String username, long postId);

	void editPost(long postId, String username, PostRequest editPostRequest);

	PagedModel<PostResponse> getTopicPosts(long topicId, int page, int limit);

	PagedModel<PostResponse> getUserPosts(long userId, int page, int limit);
	
	PagedModel<PostResponse> getSubPosts(long postId, int page, int limit);
}
