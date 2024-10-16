package com.gustav.bookstore.repo

import com.gustav.bookstore.domain.Book
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : MongoRepository<Book, String> {}