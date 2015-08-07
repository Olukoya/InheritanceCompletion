public class Book extends Product {
    private String author;
    private int pages;
    public Book()
    {
    	super.setCode("");
    	super.setDescription("");
    	super.setPrice(0.0);
        count++;
    	author="";
    	pages=0;
       
    }
    
    public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor(){
    	return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

 
    public String toString(String pattern)
    {
    	if(pattern.equalsIgnoreCase("detail"))
    	{
    		return this.getCode()+" "+this.getAuthor()+" "+this.getDescription()+" "+this.getPages()+" "+this.getPrice();
    	}
    	else
    		return  this.getCode()+" "+this.getDescription()+" "+this.getPrice();
    }
    
/*    @Override
    public boolean equals(Object o) {
    	if(this.author.equalsIgnoreCase(((Book)o).getAuthor())){
    		return true;
    	}
    	else
    		return false;
    	
    } */
   
}
