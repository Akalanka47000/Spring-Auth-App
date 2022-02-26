<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Spring Auth | Login</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="../tailwind.config.js"></script>
</head>
<body>
<section class="flex justify-center items-center h-screen bg-gray-800">
    <div class="max-w-md w-full bg-gray-900 rounded p-6 space-y-4">
        <div class="mb-4">
            <p class="text-gray-400">Sign In</p>
            <h2 class="text-xl font-bold text-white">Join our community</h2>
        </div>
        <form action="login" method="post">
            <div>
                <input class="w-full p-4 mb-2 -sm bg-gray-50 focus:outline-none border border-gray-200 rounded text-gray-600" type="text" name="email" placeholder="Email">
            </div>
            <div>
                <input class="w-full p-4 mb-2 text-sm bg-gray-50 focus:outline-none border border-gray-200 rounded text-gray-600" type="text" name="password" placeholder="Password">
            </div>
            <div>
                <button type="submit" class="w-full py-4 bg-blue-600 hover:bg-blue-700 rounded text-sm font-bold text-gray-50 transition duration-200">Sign In</button>
            </div>
        </form>
        <div class="flex items-center justify-between">
            <div class="flex flex-row items-center">
                <input type="checkbox" class="focus:ring-blue-500 h-4 w-4 text-blue-600 border-gray-300 rounded">
                <label for="comments" class="ml-2 text-sm font-normal text-gray-400">Remember me</label>
            </div>
            <div>
                <a class="text-sm text-blue-600 hover:underline" href="#">Forgot password?</a>
            </div>
        </div>
    </div>
</section>
</body>
</html>