<a href="./LICENSE.md">
<img src="./images/cc0.svg" alt="Creative Commons 0 1.0"
align="right" width="10%" height="auto"/>
</a>

# Kotlin Shopping Cart

[![Build](https://github.com/binkley/modern-java-practices/actions/workflows/ci-earthly-maven.yml/badge.svg)](https://github.com/binkley/modern-java-practices/actions)
[![CodeQL](https://github.com/binkley/modern-java-practices/actions/workflows/github-code-scanning/codeql/badge.svg)](https://github.com/binkley/modern-java-practices/actions/workflows/github-code-scanning/codeql)
[![vulnerabilities](https://snyk.io/test/github/binkley/modern-java-practices/badge.svg)](https://snyk.io/test/github/binkley/modern-java-practices)
[![coverage](https://github.com/binkley/modern-java-practices/raw/master/images/jacoco.svg)](https://github.com/binkley/modern-java-practices/actions/workflows/ci.yml)
[![pull requests](https://img.shields.io/github/issues-pr/binkley/modern-java-practices.svg)](https://github.com/binkley/modern-java-practices/pulls)
[![issues](https://img.shields.io/github/issues/binkley/modern-java-practices.svg)](https://github.com/binkley/modern-java-practices/issues/)
[![license](https://img.shields.io/badge/License-CC0%201.0-green.svg)](http://creativecommons.org/publicdomain/zero/1.0/)

Example code for typesafe shopping carts in Kotlin.

## License

This work is dedicated to the Public Domain.
In countries where Public Domain is restricted, the Creative Commons 0
Universal license applies.
See the [license](LICENSE.md) which provides text for both _Public Domain_ and
_Creative Commons 0 Universal_.

## Implementation

Items in a shopping cart are tracked by their UPC, not their locale-specific
descriptions or local market prices.
See <https://www.barcodefaq.com/1d/upc-ean/#GTIN_Compliance> for examples.
