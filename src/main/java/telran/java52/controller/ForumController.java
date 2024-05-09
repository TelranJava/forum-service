package telran.java52.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java52.dto.PeriodDto;
import telran.java52.dto.PostDto;
import telran.java52.dto.UpdCommentDto;
import telran.java52.dto.UpdPostDto;
import telran.java52.service.ForumService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/forum")
public class ForumController {

	final ForumService forumService;

	@PostMapping("/post/{author}")
	public PostDto addPost(@PathVariable String author, @RequestBody UpdPostDto post) {
		return forumService.addPost(author, post);
	}

	@GetMapping("/post/{postId}")
	public PostDto findPost(@PathVariable String postId) {
		return forumService.findPostById(postId);
	}

	@PutMapping("/post/{postId}/like")
	public void addLike(@PathVariable String postId) {
		 forumService.addLike(postId);
	}

	@GetMapping("/posts/author/{author}")
	public Iterable<PostDto> findPostsByAuthor(@PathVariable String author) {
		return forumService.findPostsByAuthor(author);
	}

	@PutMapping("/post/{postId}/comment/{author}")
	public PostDto addComment(@PathVariable String author, @PathVariable String postId,
			@RequestBody UpdCommentDto comment) {
		return forumService.addComment(postId, comment, author);
	}

	@DeleteMapping("/post/{postId}")
	public PostDto deletePost(@PathVariable String postId) {
		return forumService.findPostById(postId);
	}

	@PostMapping("/posts/tags")
	public Iterable<PostDto> findPostsByTags(@RequestBody List<String> tags) {
		return forumService.findPostsByTags(tags);
	}

	@PostMapping("/posts/period")
	public Iterable<PostDto> findPostsByPeriod(@RequestBody PeriodDto period) {
		return forumService.findPostsByPeriod(period);
	}

	@PutMapping("/post/{postId}")
	public PostDto updatePost(@PathVariable String postId, @RequestBody UpdPostDto post) {
		return forumService.updatePost(postId, post);
	}

}
