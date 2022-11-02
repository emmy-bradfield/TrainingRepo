# Basic data structures in R


# Vectors

bill_01 <- c(order.food.garlic_bread, order.food.penne_arrabiata, order.drink.orange_juice)
reciept_01 <- c(bill_01, order.cost, order.tip, order.total)

print(bill_01)
print(reciept_01)


# Sequences

count_to_10 <- 0:10
count_to_10_again <- seq(from=0, to=10, by=1)
count_to_10_quickly <- seq(from=0, to=10, length.out=5)
do_10_times <- rep(c(0, 1), 10)
do_more_10_times <- rep(c(0, 1), time=10, each=2)

print(count_to_10)
print(count_to_10_again)
print(count_to_10_quickly)
print(do_10_times)
print(do_more_10_times)


# Element Access

print(reciept_01[1])
print(reciept_01[length(reciept_01)])
print(reciept_01[c(-(length(reciept_01)-1), -(length(reciept_01)-2))])


# Operators

reciept_01_vat <- numeric(length(reciept_01))
for (i in seq_along(reciept_01)){
  reciept_01_vat[i] <- reciept_01[i] * 1.2
}
print(reciept_01_vat)


# Vector Recycling

some_numbers <- c(1, 64, 20, 1, 34, 12, 9, 87)
less_numbers <- c(3, 6, 12)
new_numbers <- some_numbers * less_numbers
print(new_numbers)

some_sequence <- 1:20
flip_flopper <- c(1, -1)
flip_flop <- some_sequence * flip_flopper
print(flip_flop)


# Boolean and Characters

age <- 23
is_adult <- age > 18
is_pensioner <- is_adult && age > 65
print(is_adult)
print(is_pensioner)

ages_of_people <- c(21, 78, 12, 45, 25, 67, 56, 37, 81, 4, 18, 16, 34)
gets_pension <- numeric(length(ages_of_people))
for (j in seq_along(ages_of_people)){
  gets_pension[j] <- ages_of_people > 64
}
print(gets_pension)

names_of_people <- c("Alice", "Bob", "Charles", "Dave", "Emily", "Frank", "Georgia", "Harriet", "Igor", "James", "Kyle", "Lucy", "Mike")
for (k in seq_along(names_of_people)){
  writeLines(names_of_people)
}


# Missing Data

oranges_in_bowl <- c(5, 4, NaN, 2, NaN, 6, 5, 4, NaN, 4, 4, 3, 2, NaN, 2, 1, 0)
for (l in seq_along(oranges_in_bowl)){
  if ( is.nan(oranges_in_bowl[l]) ){
    oranges_in_bowl[l] = NA
  }
}
print(oranges_in_bowl)


# Infinity

too_big <- 10^100000
not_allowed <- 1/0
zero <- 1/-Inf
print(too_big)
print(not_allowed)
print(zero)

is.infinite(too_big)
is.infinite(not_allowed)
is.infinite(zero)
is.infinite(34896123)