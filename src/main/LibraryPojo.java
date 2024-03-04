import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class LibraryPojo {
        private float page;
        private float per_page;
        private float total;
        private float total_pages;
        ArrayList<Object> data = new ArrayList<Object>();
        Support SupportObject;

        public float getPage() {
            return page;
        }

        public float getPer_page() {
            return per_page;
        }

        public float getTotal() {
            return total;
        }

        public float getTotal_pages() {
            return total_pages;
        }

        public Support getSupport() {
            return SupportObject;
        }

        public void setPage( float page ) {
            this.page = page;
        }

        public void setPer_page( float per_page ) {
            this.per_page = per_page;
        }

        public void setTotal( float total ) {
            this.total = total;
        }

        public void setTotal_pages( float total_pages ) {
            this.total_pages = total_pages;
        }

        public void setSupport( Support supportObject ) {
            this.SupportObject = supportObject;
        }
    }
    class Support {
        private String url;
        private String text;


        // Getter Methods

        public String getUrl() {
            return url;
        }

        public String getText() {
            return text;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

