package telran.java52.service;

import java.util.List;
import java.util.Set;

import telran.java52.dto.PeriodDto;
import telran.java52.dto.PostDto;
import telran.java52.dto.UpdCommentDto;
import telran.java52.dto.UpdPostDto;

public interface ForumService {
	PostDto addPost(String user, UpdPostDto post);

	PostDto findPostById(String postId);

	void addLike(String postId);

	PostDto addComment(String postId, UpdCommentDto comment, String author);

	PostDto deletePost(String postId);

	Iterable<PostDto> findPostsByAuthor(String author);
	
	Iterable<PostDto> findPostsByTags(List<String> tags);

	Iterable<PostDto> findPostsByPeriod(PeriodDto period);

	PostDto updatePost(String postId, UpdPostDto post);
}
