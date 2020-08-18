package com.example.machinetestiroid.model;

import java.util.List;

public class Categories {


    /**
     * status : success
     * categories : [{"category_id":"116","name":"Appliances","image":"http://iroidtechnologies.in/friday/image/catalog/Category/kitchen.png","parent_id":"0","top":"1","subcategory":[{"category_id":"128","name":"COOKER","image":"","parent_id":"116","top":"0"},{"category_id":"126","name":"MIXER","image":"","parent_id":"116","top":"0"},{"category_id":"127","name":"OVEN","image":"","parent_id":"116","top":"0"},{"category_id":"129","name":"TOASTER","image":"","parent_id":"116","top":"0"}]},{"category_id":"114","name":"Electronics","image":"http://iroidtechnologies.in/friday/image/catalog/Category/responsive (1).png","parent_id":"0","top":"1","subcategory":[{"category_id":"122","name":"LAPTOP","image":"","parent_id":"114","top":"0"},{"category_id":"123","name":"MOBILE ","image":"","parent_id":"114","top":"0"},{"category_id":"120","name":"TELEVISION","image":"","parent_id":"114","top":"0"},{"category_id":"121","name":"WASHING MACHINE ","image":"","parent_id":"114","top":"0"}]},{"category_id":"106","name":"Fashion","image":"http://iroidtechnologies.in/friday/image/catalog/Category/clothes.png","parent_id":"0","top":"1","subcategory":[{"category_id":"130","name":"KIDS","image":"","parent_id":"106","top":"0"},{"category_id":"110","name":"Mens Fashion","image":"catalog/hero_Standard.jpg","parent_id":"106","top":"1"},{"category_id":"111","name":"Women Fashion","image":"","parent_id":"106","top":"0"}]},{"category_id":"115","name":"Furniture","image":"http://iroidtechnologies.in/friday/image/catalog/Category/couch.png","parent_id":"0","top":"1","subcategory":[{"category_id":"124","name":"BED","image":"","parent_id":"115","top":"0"},{"category_id":"125","name":"TABLE","image":"","parent_id":"115","top":"0"}]}]
     */

    private String status;
    private List<CategoriesBean> categories;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CategoriesBean> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesBean> categories) {
        this.categories = categories;
    }

    public static class CategoriesBean {
        /**
         * category_id : 116
         * name : Appliances
         * image : http://iroidtechnologies.in/friday/image/catalog/Category/kitchen.png
         * parent_id : 0
         * top : 1
         * subcategory : [{"category_id":"128","name":"COOKER","image":"","parent_id":"116","top":"0"},{"category_id":"126","name":"MIXER","image":"","parent_id":"116","top":"0"},{"category_id":"127","name":"OVEN","image":"","parent_id":"116","top":"0"},{"category_id":"129","name":"TOASTER","image":"","parent_id":"116","top":"0"}]
         */

        private String category_id;
        private String name;
        private String image;
        private String parent_id;
        private String top;
        private List<SubcategoryBean> subcategory;

        public String getCategory_id() {
            return category_id;
        }

        public void setCategory_id(String category_id) {
            this.category_id = category_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        public String getTop() {
            return top;
        }

        public void setTop(String top) {
            this.top = top;
        }

        public List<SubcategoryBean> getSubcategory() {
            return subcategory;
        }

        public void setSubcategory(List<SubcategoryBean> subcategory) {
            this.subcategory = subcategory;
        }

        public static class SubcategoryBean {
            /**
             * category_id : 128
             * name : COOKER
             * image :
             * parent_id : 116
             * top : 0
             */

            private String category_id;
            private String name;
            private String image;
            private String parent_id;
            private String top;

            public String getCategory_id() {
                return category_id;
            }

            public void setCategory_id(String category_id) {
                this.category_id = category_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }

            public String getTop() {
                return top;
            }

            public void setTop(String top) {
                this.top = top;
            }
        }
    }
}
