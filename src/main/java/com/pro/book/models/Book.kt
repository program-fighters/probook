package com.pro.book.models

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("This is Book Model")
data class Book(
        @ApiModelProperty(value = "name of book")
        var name: String,
        @ApiModelProperty(value = "price of book")
        var price: Long
)