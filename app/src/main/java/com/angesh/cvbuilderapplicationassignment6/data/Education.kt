package com.angesh.cvbuilderapplicationassignment6.data

data class Education(
    val collegeName: String,
    val program: String,
    val logo: String
) {

    companion object {
        fun getEducationList() : MutableList<Education> {
            return mutableListOf(
                Education(
                    "Maharishi Internation University",
                    "Master's in Computer Science",
                    "https://maharishischool.org/wp-content/uploads/MaharishiSchoolTreeLogo-8cc541-green.jpg"
                ),
                Education(
                    "Maulana Azad National Institute Of Technology",
                    "B.Tech in Computer Science & Engineering",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSM8mVtevXVu8Oom137GPsWVw2l6XrHHzlqE2SGw4oXCCkEmQ_a66Ecx3Rmph3sCebRtNQ&usqp=CAU"
                )
            )
        }
    }
}
