package com.angesh.cvbuilderapplicationassignment6.data

data class Work(
    val companyName: String,
    val fromDate: String,
    val toDate: String,
    val location: String,
    val logo: String,
    val roles: String
) {
    companion object {
        fun getWorkList() : MutableList<Work> {
            return mutableListOf(
                Work(
                    "Kforce Inc",
                    "May 2022",
                    "Till Date",
                    "Tampa, Fl",
                    "https://s3-us-west-1.amazonaws.com/upload.comparably.com/138087/companies/138087/logo_1665511863193.jpg",
                    "working as a senior full stack engineer with client TheHomeDepot"
                ),
                Work(
                    "Mentee Methods Pvt.Ltd.",
                    "July 2020",
                    "July 2021",
                    "Kathmandu, Nepal",
                    "data:image/png;base64,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" ,
                    "Developed new features with problem analysis and implemented optimal solutions.\n"
                ),
                Work(
                    "Education PArk",
                    "April 2017",
                    "June 2020",
                    "Kathmandu, Nepal",
                    "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAABQVBMVEX///8ZXKX/bQAznjUMWKMATp8AAEcAUKBnibsAVaJfhLkAS54AUaAASZ0AAEgAU6FUDW4AG1AAFE0AGE//ZgAAIFMAEUwtnC/29/j/XgD/aAC6vsgADUu0uMPEz+IACEpWY34lmifb4u0AAEGMk6QLlRBBAGBOW3mVm6sAJVXQ2eiLo8kZMl2qsLwnmynr9OudsdFtd47Iy9PX6ddrs2z/+PXl6vKuvthykb8MK1iBiZxKpkzU59RcrV2YyJkAkAD/oHX/3M6Vq81IdbF/msRDUnLA3MCw1LB4uXn/waj/z7z/k2D/uJr/r40vZqr/fzgvQmeAvIG11rWSxZLGuc01AFhjMHpUqVX/7+j/1cT/TAD/kl7/h0oAOZcpPWSvnLmYf6Z/XZGmkbHPxdVsP4GMbptdJHWDYpT/eS4AADoAADN/+NjwAAATxElEQVR4nO1di1vayNcOQoLcpIBAQASDRgTkpjaA9wLeeqFW29puW9vd/vptu///H/CdM5NAbkAErNgn7/OsmDCZmXfOdc7ELsPYsGHDhg0bNmzYsGHDhg0bNmzYsGHDhg0bNmzYsPFYsD3wG77yG6dxf6iI8QFETkXh907lnrAXj4umYrwWneU3v3s294Arwel0iiZSPBQHfPHY4IwDkfie4f4+EnSWDx9gStPFNiHiFE71XxDmZtQfGw5BSeMmTK7ofaf4ILOaJs7jzvhB3GhwNwPuPz4Ai/IZMBHONLd5EW+BHM3d7IyiwpvcBIbC2Q7QvNbc3kdyFcFUhqb9zAQOjnb2DTdBS8uHIKz4ueb2Kdw5qIhGO6wcOo9m1b/CfOPijn79wdOUr7cNDMHRCGcgSL0HOhTLs+tfTzG0xwWd1kHYi79hRL2WQmNxG0QraOW1h33MrH89LJMApzcs8Jk78EO40twFgYvMdVlnhjRGzqx/fUOnF3dqb58J8Rtmx0BciB/AXUEj2QOyRjPOEOOCVh9RMGCNB/rW4iFT1q7GFaY/ezPMEHQufr6HQVzrbSqiyFwd6b1sBe6IWioowfJZeXbtEPMwYVs0BHdm/6iyv2NovsPva70Seipx/wBznXud5/jA6CbsvykbZ7hfMQniPKMTK0bONxWTFZod7JHlN4ni1oAmDM5ndpUUixLoJCDIjecpIH6czrYIyX4BArsxJFpCRYS4iTuRm6nPa3ogEgCPMaYMRR4TP+folg+IbTEOucveeIYknmEKsDezGwuKilNwMqfG0GAF58z2kTir2woVro9OGUNNxiIODmc0mdGCH5ffHwHpoSdw33j77v3bh57DnXF4eHZq1Xjerj95sv7kq2VnefrmwLl388C+tXIkCIJ4Y8n0vgJBwPr6N0vKei0K5Xh8vOxhiqiQijZEsdHzkAkSkn9/H9V6X1B2w1OZ5wSgNXtI1EaJ8R8kuP7t/Tohum5ukE+VX87kfqHnqU53DNDDB/jvaDjFb2iDf6NNfacswSANjT58kH/BHN4ZJzWDc0Or3wxIlcEblEeVHgjBt4z0vx9vwQj579/+b33daJCv5E+i+8IOlraMJzq/G7gxF67O8ZhlyJ7gx/qT9f/xxBRBfj/egiz5t0/Wf2Q1rS6ey7/gsomHWC6YhTyc1sbwtFM0Frxl/AsEv4IAFV8DLL+9Zf7RxYGnCfkX3GEI+0SQI837N4CaDNbJ4oMS7r/XFQGq8M4Q514oSnoolPd4PNNwCg9uhQiioXvIdIBjB4JfGZ4KcJ0Cf9M3+/iX4mduxB2mImBRY0Y2wzdAsbzD7IumB2U8eM7vJJ0BVsTPgKP5Cjf1DZOvld+OrilBcSYkiNjBrf0b2N2ZGSKf/efr9+/vkB8a3oePz59/BGFlf+jaHScu5N8qZ7iTjgvlGbBBBVeCEBevmX3zKaHc3j958l5iPhwvJhYBieTxM12jZ4lEL9wzp0eiuDND/BBXB+LAUz9k+PbdDxRTck5GMvFa2yiZ/NS/2K7M5E64MihYfMcY/415trg4p0Lig7rNi8XF5wMefwT4TuLC88ScBhpG8GViwNOPAVlk+EFHcG7xot/iaWIuefxQ05sCvo9k+DM5t/jxweY3OZ78iz/1DBN9b3oMBrr4YNObAv79B3++SOoY9r6/APKPWkmZ9yS4P9MKcVFJQukXiUempE81V++ekI/PGiEuKm2ogc6yku5fH0DifX6mjtHPXqou+G90M/90TkWxZ4VPyc1ZVtI9sYxvHsYF8VzF8eOiPisDPP2phPzFPkFK28STXp07RbE8A3X+63KvZCSq3ph5/tenD8bGF0malh4rKvr0Z1LndpRuRYFWgARxvGOe6YG+IEuKRk71wdFFIvHKpPmzi5cXfXkpiqtX0u2y4Owt3INvofD1kvj5uUje5ladT79MLCZHpJofkrJl6pT0lK5amS7bg7+dSYQoHFYO46BX6nobxPHETxNz7KGfqWqVlFSgQDvP8AXbWXjzhLxyLzj3mVPwOuqywwtwLInPJuZIcdwjmHyh+QKkJ95cMaf0JekH9zQMvr9FtGmnwuwfHKl16nUSN4IvTDl+nOvvpbQbp8OjODjQffktxdnYBx+KpDoNu3xmX/OmCJVQ4rPBHj++Vmc4CU2GcACk9m/kLmeDIFjODYmKgv5NGHlDkVxMvLjoS/LZqzlNBpf8rOsO1D1u9bznt2H7ek8E7Oko9pJRIJn4+en4+PjTz0RCs9fX7qMYfNnhSBDKgiDuzYoAh+JCLa0kYs6AhN5QK1d3OXd9aBwvGinp8POh5zghXptITaukZrnPY8LTUUJMDMsKHgWe6esXehk+9AQnx8uhUpzlraFlfB5mio+5EtzDUFPUJjSPFR8Hm2Ly9ejHHwMGR8XFl6OffhQYrKSPPlbIGBgy/oBYIeOVuZ7+EbFChjnDPyJWyLgwpfhnxAoZpgwf+75CA7Pk7dHvKzR4auJO/5hYQfHJmJ4+5sN7E3w0qKmhBvXYYVDTWUvZCumCNNGL88d6NZ3IDHmpMO3X+NNf3Kwv4Go3WvXsWH0/16vpWCkbn01XO96uz8cG6uM8PwwuB8LlCgbdAYe3lb7zX8Do1FR3XjEaUrrldQRYv8dDpuK+6/gj0Qo6+nAF/T7XfD07+rE+dJt9XSl4OApVr9/np9QoPJ07zn80pIBDB1eQDTbqllVWF/QNpeBByFbbPreaHIHvTqtrDW39IISlP9CuWlNY/Rsnlh4qdFysgR2iOwmVAUj7TQYiogy0LUlSeyJjwQwLHbfbYz5ocOp+BuE2H4xKcr4w8nmNIY40Q6nlYAfQAwTu5U++OoMHBJJsd9SyagxxhBkWvIHgsNHmp0dLhaxvyJgAv7869PlnaoZDzTDdZc1srw93eqrMeugOZwgch5qHen8xzAyzXXbUQJ6pc6OoD1MceXG7Q7y4JTPkG4Hh8kOCrfugh4OPUFOCQHHg86rUdKAZpv3DrF0Z497+pHh+5OoC/N1Bfk7lagaZYcPKIrra90WQSQ8OGOoJuAdEjr6rUf/1gQpSd7QdOO4rGFJY0CBEwNyp9l/3Nt8bpn1WdAQytvsjyBQtUmQbpo/3ZGi6N6waMl9zeMw7nw5GhcQe/F6zx3tZjVmJpjMyRijLNzp9mgAjQ2Jvoc28wSuFocmp2rwlGye4T4JM1ZIrQLhMXKpS+japlHoH5PUmazc8c5oUvEVbQYoOA0XFmRoPLLyWV+4eg+Gdp2KkqDhTQ7z3WvRgjnsNhhR8O+AjYFnW7fZj1WSgi3cZtqkyw6Se4OBlc7k8Ho/f73e7WYov95R0qzkiJEnKZgvpdL1abHi7fh/rD5psxQ3u5rVp2t0wsUGXJ+hnfT5He75TrNbT6UIhm83iqA/0b8CQIl+b1RaLkKIuaNDMVBfvi7ow4Qq6A552p5oer2w5cqp0qQiyCgqItAZ4hzRVz0JKF9s+d1DF0q3Nw2lmqv17jLo6xnr8Psd8VV3tBX0hE9APLiNrxHAp890Aq4eb2IBbD5bc9vkCblfX22jVlQpqodoO+HskfRqzoWVhzcloIdCXnc/RqUvySqfrxUa762GJybsNwyszU18S+L6MSgg6VtMWrdV4/G7W121USfd8usG6ZZIa507rbeqTUV6xwaBStJPqRa+LGra1NFU7E8doQ61bD3nG/sGE2i3CMj2vVFpUfZNtvuYFBVqj9Pi6hJ5Un/cbjPku8LSt2G52ghEoS7aBusnXSblFkygndPv7ForQz3awMpBtOXzBiYZ2uC1WqPhx1EPL0u0uokwKbdgQqU3xtXZjgYV01kG2e/Wuz3rYH4CA5eoG75+UIogu4CWC8fpc7r7mYLhQOZqui+0S/i3Wcl46hOAdkgHJMfF6giADXiLHrq+vO/juUN/R1AOUX3VI7df6cMG7HWV0VB7fhfAggkH5B/nFg/eHcyThsN7PtCBcqBwNPQMsOIbLrz+8Di4K2sozsDw0CHy90XVB3unottte73yj0ykWW61WVUarVex0GvPeNigaRCy3cqynQ9CBC8v3UhsIF/2Mhsa+hpnvlsOPzxeE8ZXhyQQQ+CuM3sDx2+1u1wEu/H6q4MpiSBCf8WiWhTCmJ6qt2cDuQpvRSI6gnhsGVm+nWi9kJztX1yF9tyyQN28sFeqddoDV+HxtzSahzWjSmvyC5mzmx8uY799hfoW6PrXh578EWFi6FiTy/WyPpIP1ehVUsgEK0XW4/G7I03ADhT/cRIcamPyr1ydb9bKqY7GgeofxM6kulaqyC5ff1y2m+70QvYCNC5gBbDICFJjCBV1dGBT0tghzrSvbDmW2dLPDBr6YBI4C6AuofxD3YkqeB/kg7M2GehXiBdBm2O58q3/uXSj2D8c8qn3i8aLqNZpedc3lD3jljBSXv+h1BHzy5nPQoMT3BMnOsZ+lkrnCI2zbPHcrjj4xGAqXx88G2j1BZIt+OTlV7RNfqv5CWJGgp3fEKoF7C7gnSdvIPNiBJeNsd/K4CzQD3aJsBOk2XbT+PvF5799LYtKUoN9fpAue7rh8Vk4tRsHnHWaw1QnFKMPD+juUZHae9OhXXp348JfiSumrD275YDXd8A060b7j0J4RmY3UtlqYHTWScigskeOyXnL6l+JKsZGb5jR8y+WeyspCcLLwFkp9GikUgZ8tEn2RvBATWFl15uRhGh5IZdLyElgv4A1H0GGpHs7Pj7MJNoVHPk1Mu4JKFVB2NAWfy0ccujQ/HcNw9JJEK4AJTWlQyKeornYCsoOTzVBx6J2p8QOVv0sdrjPBRl8HmUohqD4Uq34hfC2d+FqDy3fHav80AocyNk1N+XY/feNdhPX0zGFgjB+G1vT0h6XhsNibBPEwWdfUBOhxj3UsLLWtH3iNmoFJBSw9PUPwzY+7CalbPHYeDRer34BbPfEdjaBrgqMMflrxH0KxNlJVp2aCVmL8MNRHvH9lHZo3QicpymrgH/aKkjXw3mmttqrkNi0bdFmvHw7DtIJW/zhRmtKiuccIEaaYVhrX22B0p6L5d47xw5AOTiWNC1CbKU6lM3boNvDuaAXZXoFybNByhhSYtB+Af7wYPxSFasNLMT82vBgyqt7JMV+d8f+rkA0bNmzYsGEEb+2cTPo9r3QtcVEZHLO8sEru8avcEsOsxEKIVXm/8otcRZoMs5GPcRy3WVsi92uZE/JZytCHpVoIvuXWyMVlKLYLH6u9Mbb41QXyHF9LQauVLJ1DeIU0P+FK8qxwiMzJBrnY4qKrdDFKeDt1SW5zGWwrLYQvRzH8xXGhZnOB434xy2GOMuRiyDCfx6n+JzPkmmG8DDPMWqgZ2QxxscwJiqoWydHRIwvkYzWUid1Gf23QjvLNCHz+B9Nt4vO/tnguvERmHeJuL2HqOM2lWJPbIgxjMsPlWLN5GYnFyOx3Q9EI5boRyd/CohFSXATbbuZDo/QFNIrfCKXwBURmOSIzXAjDgCuhFfVBJRdZ5unlWmgTV29tIY+ftZDCMINT46InOFmqgaVULZ+CSxgjm8LnJYYyBOq30EK6zKOKLIXzpCsVQzKTUoxcN6O1KBXURqhJRkotM0wGGYK+WNoSy8tvwlAFuvYIyhAnEN7QMeQz+RPVM7nU0kpkV9UnIzOsRVNk5fgwtl9KrVxiV3qGTA6nkOVCUoqT+gyZzdAuZbjMcctWCI7LkLnEldcwhB+qNeU5ji9FoiYMueiu3FcU5r6UOlmKcbyRIel7LVZjQkQlewwja4Qh9LVriaCKYWQZUQoRhtHcFkJhGF3Dq6yKIUyP1zKsRZuqfpdjt4zEZbYMDLdSYbnbrRhcLkG7ZnTFyDCEwrqNLYMpnvQZlmLoeDKh0klUIwNLDJupDCDWJAypp+EUhs0IXKzuqhiWQguSlqF2zJUYqN5taM3AcCmckkUtobItxTZBjgtbaoaxra3l2zxQkUARYCFQxMiwVruMhVCbMs3bqMYkrDHM1xArecrwklwpDPM5vCqpGG6E9DI8ieb63fJcSupp1iCG4IAIQ+Ykf8vk+gybsJypGDyyQSJJhKgp9LW6Go6SJcs0o7lQeOOuDLV2WFM3MrHDWjSissNQBlcl2n9iKdyMpFLRJjFNrZbGlM62wsCCMMxyqa1aqscwultbI20u8/lUKtbM5yhDni+lFrAV+rRalLOWNVj0NIrbUhjymWiNREdytYt3wZFv9Z6o5ZubgDxRU52nycurtwuJBmXI7EZOdjNaOwRIHOmk2UQ1pfpQi+YZOVpELOrpmL50Bc0EpkfdZxO9AsS5zV4EpjEZPNamgSEsfpbOHxeJMmTC+cuwgaE8NwnCscJwKbwgyQyXUylL4WIAw2gui95T1gMuukEuecKQl5Zvo9wGndhtFpKwKEnvSlw+WpJ4aSmL3kGSe5f0DGEl0F1sgQbyPYalWDNiYHgir/NmfkVhyJOlIwzBelNWcuBSiva3nNHkpaEoutJfsjGv5knW9p/ErEXQyS6kYnT5tiBP47jIKm1XWo3EMuSpWlhW5lV0qbRP/MzgZzYWgbw0E47iIixxVNEvoz07lGeCzekoa+FVntlIETO/DYPgOdJWWo2sWGC4lKPOYkv+5HM5WO/d3AoiJ6vBCblaOZGY0uXt5u3JrqK0kGvnQdkU++M3TvKhW7jMrcjTra3UlD5VnxuX/dQ6R2eZzeUUByTPBKfGK99tMSXasITf5ujENlZO+pZvw4YNGzZs2LBhw4YNGzZs2LBhw4YNGzZs2LBhw4YN6/h/EqmnM/NXQjEAAAAASUVORK5CYII=",
                    "built Online Learning application"
                ),
            )
        }
    }
}
