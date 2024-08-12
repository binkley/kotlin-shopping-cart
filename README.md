<a href="./LICENSE.md">
<img src="./images/cc0.svg" alt="Creative Commons 0 1.0"
align="right" width="10%" height="auto"/>
</a>

# Kotlin Shopping Cart

[![Build](https://github.com/binkley/kotin-shopping-cart/actions/workflows/ci.yml/badge.svg)](https://github.com/binkley/kotin-shopping-cart/actions)
[![vulnerabilities](https://snyk.io/test/github/binkley/kotin-shopping-cart/badge.svg)](https://snyk.io/test/github/binkley/kotin-shopping-cart)
[![coverage](https://github.com/binkley/kotin-shopping-cart/raw/master/images/jacoco.svg)](https://github.com/binkley/kotin-shopping-cart/actions/workflows/ci.yml)
[![pull requests](https://img.shields.io/github/issues-pr/binkley/kotin-shopping-cart.svg)](https://github.com/binkley/kotin-shopping-cart/pulls)
[![issues](https://img.shields.io/github/issues/binkley/kotin-shopping-cart.svg)](https://github.com/binkley/kotin-shopping-cart/issues/)
[![license](https://img.shields.io/badge/License-CC0%201.0-green.svg)](http://creativecommons.org/publicdomain/zero/1.0/)

Example code for typesafe shopping carts in Kotlin.

## License

This work is [dedicated](LICENSE.md) to the Public Domain under the Creative
Commons Zero 1.0 Universal license.

## Implementation

Items in a shopping cart are tracked by their UPC, not their locale-specific
descriptions or local market prices.
See <https://www.barcodefaq.com/1d/upc-ean/#GTIN_Compliance> for examples of
UPC codes.

It is challenging to provide a _general solution_ that covers:
- Physical shopping carts, such as shoppers adding multiple of an item, or
  adding multiple of items that are measured by weight/volume.
  Shoppers want to add/remove the same items.
- Scanning systems or online systems want to track subtotals for multiples.
  These are interested in subtotals of counts or weight/volumes.
