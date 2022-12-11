package com.angesh.cvbuilderapplicationassignment6.data

data class Certification(
    val logo: String,
    val name: String
) {
    companion object {
        fun getCertificateList(): MutableList<Certification> {
            return mutableListOf(
                Certification(
                    "https://images.credly.com/images/be8fcaeb-c769-4858-b567-ffaaa73ce8cf/twitter_thumb_201604_image.png",
                    "Microsoft Certified Azure Fundamentals"
                ),
                Certification(
                    "https://media.licdn.com/dms/image/C560BAQE88xCsONDULQ/company-logo_100_100/0/1618231291419?e=1678924800&v=beta&t=729QuuwjMFqpA1P41jZ45IS5jNAsZTeWjSx3oAZ6qEI",
                    "Microsoft Certified Office Specialist"
                ),
                Certification(
                    "https://media.licdn.com/dms/image/D4E0BAQHYCgYovUuPtQ/company-logo_100_100/0/1665755678671?e=1678924800&v=beta&t=lSe28c6wVW_irZtZkDKSW-6vT2vgWMDmZfZOMkurcj0",
                    "Oracle Certified Cloud Architect"
                )
            )
        }
    }
}
