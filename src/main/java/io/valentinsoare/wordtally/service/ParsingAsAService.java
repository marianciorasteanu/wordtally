package io.valentinsoare.wordtally.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.InputStream;
import java.nio.file.Path;

/***
 * The ParsingAsAService interface defines the contract for parsing services capable of asynchronously counting various elements (lines, characters, words, bytes) in input files.
 * It also includes a method to check if an input stream is ready to be read, ensuring data availability before processing.
 * This interface is designed to be implemented by services that perform parsing operations in an asynchronous manner, leveraging CompletableFuture for non-blocking I/O operations.
 */
public interface ParsingAsAService {
   Long countTheNumberOfLines(Path inputFile);
   Long countTheNumberOfChars(Path inputFile);
   boolean checkTheReaderIsReady(InputStream inputStream) throws JsonProcessingException;
   Long countTheNumberOfWords(Path inputFile);
   Long countTheNumberOfBytes(Path inputFile);
}
