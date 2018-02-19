package don.com.moviesiak.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultsItem{



	@SerializedName("overview")
	private String overview;

	@SerializedName("original_language")
	private String originalLanguage;

	@SerializedName("original_title")
	private String originalTitle;

	@SerializedName("video")
	private boolean video;

	@SerializedName("title")
	private String title;

	@SerializedName("genre_ids")
	private List<Integer> genreIds;

	@SerializedName("poster_path")
	private String posterPath;

	@SerializedName("backdrop_path")
	private String backdropPath;

	@SerializedName("release_date")
	private String releaseDate;

	@SerializedName("vote_average")
	private double voteAverage;

	@SerializedName("popularity")
	private double popularity;

	@SerializedName("id")
	private int id;

	@SerializedName("adult")
	private boolean adult;

	@SerializedName("vote_count")
	private int voteCount;

	public void setOverview(String overview){
		this.overview = overview;
	}

	public String getOverview(){
		return overview;
	}

	public void setOriginalLanguage(String originalLanguage){
		this.originalLanguage = originalLanguage;
	}

	public String getOriginalLanguage(){
		return originalLanguage;
	}

	public void setOriginalTitle(String originalTitle){
		this.originalTitle = originalTitle;
	}

	public String getOriginalTitle(){
		return originalTitle;
	}

	public void setVideo(boolean video){
		this.video = video;
	}

	public boolean isVideo(){
		return video;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setGenreIds(List<Integer> genreIds){
		this.genreIds = genreIds;
	}

	public List<Integer> getGenreIds(){
		return genreIds;
	}

	public void setPosterPath(String posterPath){
		this.posterPath = posterPath;
	}

	public String getPosterPath(){
		return posterPath;
	}

	public void setBackdropPath(String backdropPath){
		this.backdropPath = backdropPath;
	}

	public String getBackdropPath(){
		return backdropPath;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setVoteAverage(double voteAverage){
		this.voteAverage = voteAverage;
	}

	public double getVoteAverage(){
		return voteAverage;
	}

	public void setPopularity(double popularity){
		this.popularity = popularity;
	}

	public double getPopularity(){
		return popularity;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setAdult(boolean adult){
		this.adult = adult;
	}

	public boolean isAdult(){
		return adult;
	}

	public void setVoteCount(int voteCount){
		this.voteCount = voteCount;
	}

	public int getVoteCount(){
		return voteCount;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"overview = '" + overview + '\'' + 
			",original_language = '" + originalLanguage + '\'' + 
			",original_title = '" + originalTitle + '\'' + 
			",video = '" + video + '\'' + 
			",title = '" + title + '\'' + 
			",genre_ids = '" + genreIds + '\'' + 
			",poster_path = '" + posterPath + '\'' + 
			",backdrop_path = '" + backdropPath + '\'' + 
			",release_date = '" + releaseDate + '\'' + 
			",vote_average = '" + voteAverage + '\'' + 
			",popularity = '" + popularity + '\'' + 
			",id = '" + id + '\'' + 
			",adult = '" + adult + '\'' + 
			",vote_count = '" + voteCount + '\'' + 
			"}";
		}

	public class Example {

		@SerializedName("page")
		@Expose
		private Integer page;
		@SerializedName("total_results")
		@Expose
		private Integer totalResults;
		@SerializedName("total_pages")
		@Expose
		private Integer totalPages;
		@SerializedName("results")
		@Expose
		private List<Result> results = null;

		public Integer getPage() {
			return page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public Integer getTotalResults() {
			return totalResults;
		}

		public void setTotalResults(Integer totalResults) {
			this.totalResults = totalResults;
		}

		public Integer getTotalPages() {
			return totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public List<Result> getResults() {
			return results;
		}

		public void setResults(List<Result> results) {
			this.results = results;
		}

	}

	public class Result {

		@SerializedName("vote_count")
		@Expose
		private Integer voteCount;
		@SerializedName("id")
		@Expose
		private Integer id;
		@SerializedName("video")
		@Expose
		private Boolean video;
		@SerializedName("vote_average")
		@Expose
		private Double voteAverage;
		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("popularity")
		@Expose
		private Double popularity;
		@SerializedName("poster_path")
		@Expose
		private String posterPath;
		@SerializedName("original_language")
		@Expose
		private String originalLanguage;
		@SerializedName("original_title")
		@Expose
		private String originalTitle;
		@SerializedName("genre_ids")
		@Expose
		private List<Integer> genreIds = null;
		@SerializedName("backdrop_path")
		@Expose
		private String backdropPath;
		@SerializedName("adult")
		@Expose
		private Boolean adult;
		@SerializedName("overview")
		@Expose
		private String overview;
		@SerializedName("release_date")
		@Expose
		private String releaseDate;

		public Integer getVoteCount() {
			return voteCount;
		}

		public void setVoteCount(Integer voteCount) {
			this.voteCount = voteCount;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Boolean getVideo() {
			return video;
		}

		public void setVideo(Boolean video) {
			this.video = video;
		}

		public Double getVoteAverage() {
			return voteAverage;
		}

		public void setVoteAverage(Double voteAverage) {
			this.voteAverage = voteAverage;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Double getPopularity() {
			return popularity;
		}

		public void setPopularity(Double popularity) {
			this.popularity = popularity;
		}

		public String getPosterPath() {
			return posterPath;
		}

		public void setPosterPath(String posterPath) {
			this.posterPath = posterPath;
		}

		public String getOriginalLanguage() {
			return originalLanguage;
		}

		public void setOriginalLanguage(String originalLanguage) {
			this.originalLanguage = originalLanguage;
		}

		public String getOriginalTitle() {
			return originalTitle;
		}

		public void setOriginalTitle(String originalTitle) {
			this.originalTitle = originalTitle;
		}

		public List<Integer> getGenreIds() {
			return genreIds;
		}

		public void setGenreIds(List<Integer> genreIds) {
			this.genreIds = genreIds;
		}

		public String getBackdropPath() {
			return backdropPath;
		}

		public void setBackdropPath(String backdropPath) {
			this.backdropPath = backdropPath;
		}

		public Boolean getAdult() {
			return adult;
		}

		public void setAdult(Boolean adult) {
			this.adult = adult;
		}

		public String getOverview() {
			return overview;
		}

		public void setOverview(String overview) {
			this.overview = overview;
		}

		public String getReleaseDate() {
			return releaseDate;
		}

		public void setReleaseDate(String releaseDate) {
			this.releaseDate = releaseDate;
		}

	}

}