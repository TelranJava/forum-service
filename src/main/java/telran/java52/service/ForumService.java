package telran.java52.service;

import java.util.List;

import telran.java52.dto.PeriodDto;
import telran.java52.dto.PostDto;
import telran.java52.dto.UpdCommentDto;
import telran.java52.dto.UpdPostDto;

public interface ForumService {
	PostDto addPost(String user, UpdPostDto post);

	PostDto findPostById(Long postId);

	Boolean addLike(Long postId); // returns Boolean or void??

	List<PostDto> findPostsByAuthor(String author);

	PostDto addComment(Long postId, UpdCommentDto comment, String user);

	PostDto deletePost(Long postId);

	List<PostDto> findPostsByTags(List<String> tags);

	List<PostDto> findPostsByPeriod(PeriodDto period);

	PostDto updatePost(Long postId, UpdPostDto post);
}
