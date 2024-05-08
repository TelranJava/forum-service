package telran.java52.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java52.dto.PeriodDto;
import telran.java52.dto.PostDto;
import telran.java52.dto.UpdCommentDto;
import telran.java52.dto.UpdPostDto;
import telran.java52.service.ForumService;

@RestController
@RequiredArgsConstructor
public class ForumController {

	final ForumService forumService;

	@PostMapping("/forum/post/{user}")
	public PostDto addPost(@PathVariable String user, @RequestBody UpdPostDto post) {
		return forumService.addPost(user, post);
	}

	@GetMapping("/forum/post/{postId}")
	public PostDto findPost(@PathVariable Long postId) {
		return forumService.findPostById(postId);
	}

	@PutMapping("/forum/post/{postId}/like")
	public void addLike(@PathVariable Long postId) {
		 forumService.addLike(postId);
	}

	@GetMapping("/forum/posts/author/{author}")
	public List<PostDto> findPosts(@PathVariable String author) {
		return forumService.findPostsByAuthor(author);
	}

	@PutMapping("/forum/post/{postId}/comment/{user}")
	public PostDto addComment(@PathVariable String user, @PathVariable Long postId,
			@RequestBody UpdCommentDto comment) {
		return forumService.addComment(postId, comment, user);
	}

	@DeleteMapping("/forum/post/{postId}")
	public PostDto deletePost(@PathVariable Long postId) {
		return forumService.findPostById(postId);
	}

	@PostMapping("/forum/posts/tags")
	public List<PostDto> findPostsByTags(@RequestBody List<String> tags) {
		return forumService.findPostsByTags(tags);
	}

	@PostMapping("/forum/posts/period")
	public List<PostDto> findPostsByPeriod(@RequestBody PeriodDto period) {
		return forumService.findPostsByPeriod(period);
	}

	@PutMapping("/forum/post/{postId}")
	public PostDto updatePost(@PathVariable Long postId, @RequestBody UpdPostDto post) {
		return forumService.updatePost(postId, post);
	}

}
