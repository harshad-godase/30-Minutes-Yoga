package harshad.g30minutesyoga

object Constants {
    fun defaultExerciseList():ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

       val catcowpose = ExerciseModel(1,"Cat Cow Pose",R.drawable.catcowpose,false,false)
        exerciseList.add(catcowpose)

        val childpose = ExerciseModel(2,"Child's Pose",R.drawable.childpose,false,false)
        exerciseList.add(childpose)

        val downwordfacing = ExerciseModel(3,"Downward Facing Dog",R.drawable.downwardfacingdog,false,false)
        exerciseList.add(downwordfacing)

        val forwardfacing = ExerciseModel(4,"Forward Fold Pose",R.drawable.downwardfacingdog,false,false)
        exerciseList.add(forwardfacing)

        val warrior1  = ExerciseModel(5,"Warrior I",R.drawable.warrior1,false,false)
        exerciseList.add(warrior1)

        val warrior2  = ExerciseModel(6,"Warrior II",R.drawable.warrior2,false,false)
        exerciseList.add(warrior2)

        val trainglepose  = ExerciseModel(7,"Triangle Pose",R.drawable.trainglepose,false,false)
        exerciseList.add(trainglepose)

        val treepose = ExerciseModel(8,"Tree Pose",R.drawable.treepose1,false,false)
        exerciseList.add(treepose)

        val seatedforwardbend = ExerciseModel(9,"Seated Forward Bend",R.drawable.seatedforwardbend,false,false)
        exerciseList.add(seatedforwardbend)

        val bridgepose = ExerciseModel(10,"Bridge Pose",R.drawable.bridgepose,false,false)
        exerciseList.add(bridgepose)

        val sunsalutation = ExerciseModel(11,"Sun Salutation",R.drawable.sunsalutation,false,false)
        exerciseList.add(sunsalutation)

        val sunsalutation1 = ExerciseModel(12,"Sun Salutation",R.drawable.sunsalutation1,false,false)
        exerciseList.add(sunsalutation1)

        val supinetwist = ExerciseModel(13,"Supine Twist",R.drawable.supinetwist,false,false)
        exerciseList.add(supinetwist)

        val happybabypose = ExerciseModel(14,"Happy Baby Pose",R.drawable.happybabypose1,false,false)
        exerciseList.add(happybabypose)

        val corsepose = ExerciseModel(15,"Corpse Pose",R.drawable.corpsepose,false,false)
        exerciseList.add(corsepose)




        return exerciseList
    }
}