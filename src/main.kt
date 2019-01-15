fun main(){
    val lib = LibraryOfBabel()
    val link = lib.search("First of all you are require to get the raw data of your image file.")
    var page = lib.getPage(link)
    var title = lib.getTitle(link)
}