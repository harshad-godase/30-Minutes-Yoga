package harshad.g30minutesyoga

class ExerciseModel(
    private var id : Int,
    private var name : String,
    private var image : Int,
    private var isCompleted : Boolean,
    private var isSelected : Boolean
) {
     fun getId() : Int {
         return id
     }
    fun setId(id:Int){
        this.id = id
    }

    fun getName():String{
        return name
    }
    fun setName(name: String){
        this.name = name
    }

    fun getImage():Int {
        return image
    }
    fun setImage(image: Int){
        this.image = image
    }

    fun getIsComplete(): Boolean{
        return isCompleted
    }
    fun setIsComplete(isCompleted: Boolean){
        this.isCompleted = isCompleted
    }

    fun getIsSelected():Boolean{
        return isCompleted
    }
    fun setIsSelected(isSelected: Boolean){
        this.isSelected = isSelected
    }
}