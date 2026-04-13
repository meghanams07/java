class Ticket {
    private int id;
    private String movie;
    private int seats;

    public void setId(int id) { 
	this.id = id;
	}
    public void setMovie(String movie) { 
	this.movie = movie;
	}
    public void setSeats(int seats) { 
	this.seats = seats; 
	}

    public int getId() { 
	return id; 
	}
    public String getMovie() { 
	return movie;
	}
    public int getSeats() {
	return seats; 
	}
}