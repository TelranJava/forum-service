package telran.java52.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
	Long id; // Long or String ??
	String title;
	String content;
	String author;
	LocalDateTime dateCreated;
	List<String> tags;
	Long likes;
	List<CommentDto> comments;
}
