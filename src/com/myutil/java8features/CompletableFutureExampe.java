package com.myutil.java8features;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * 
 * If you don’t want to return anything from your callback function and just want to run some piece of code after the completion of the Future, 
 * then you can use thenAccept() and thenRun() methods. These methods are consumers and are often used as the last callback in the callback chain.
 *
 */

public class CompletableFutureExampe {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFutureExampe cfe = new CompletableFutureExampe();
		System.out.println(cfe.cfUsingRunnableByAsync());
		System.out.println(cfe.cfThenApplyUse());
		System.out.println(cfe.cfThenCombineUse());
		
		
	}
	// cf: completable future
	public String cfUsingRunnableByAsync() throws InterruptedException, ExecutionException{
		CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {

			@Override
			public String get() {
				try {
		            TimeUnit.SECONDS.sleep(1);
		        } catch (InterruptedException e) {
		            throw new IllegalStateException(e);
		        }
				return "this is from async computation";
			}
		});
		return future.get();
		
	}
	public String cfThenApplyUse() throws InterruptedException, ExecutionException{
		CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {

			@Override
			public String get() {
				try {
		            TimeUnit.SECONDS.sleep(1);
		        } catch (InterruptedException e) {
		            throw new IllegalStateException(e);
		        }
				return "sainath";
			}
		});
		CompletableFuture<String> greetingFutute  = future.thenApply(name ->{return "hello "+name;});
		return greetingFutute.get();
		
	}
	public Double cfThenCombineUse() throws InterruptedException, ExecutionException{
		System.out.println("Retrieving weight.");
		CompletableFuture<Double> weightInKgFuture = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		    return 65.0;
		});

		System.out.println("Retrieving height.");
		CompletableFuture<Double> heightInCmFuture = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		    return 177.8;
		});

		System.out.println("Calculating BMI.");
		CompletableFuture<Double> combinedFuture = weightInKgFuture
		        .thenCombine(heightInCmFuture, (weightInKg, heightInCm) -> {
		    Double heightInMeter = heightInCm/100;
		    return weightInKg/(heightInMeter*heightInMeter);
		});

		return combinedFuture.get();
		
	}
	//compose two completable future Eg:
	/*CompletableFuture<User> getUsersDetail(String userId) {
		return CompletableFuture.supplyAsync(() -> {
			return UserService.getUserDetails(userId);
		});	
	}

	CompletableFuture<Double> getCreditRating(User user) {
		return CompletableFuture.supplyAsync(() -> {
			return CreditRatingService.getCreditRating(user);
		});
	}
	CompletableFuture<Double> result = getUserDetail(userId)
			.thenCompose(user -> getCreditRating(user));*/
	
	
}
