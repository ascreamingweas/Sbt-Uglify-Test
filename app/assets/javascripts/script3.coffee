fizzBuzz = ->
	i = 0
	while i < 100
		output = ''
		if i % 3 == 0
			output += 'fizz'
		if i % 5 == 0
			output += 'buzz'
		if output.length == 0
			output = i.toString()
		console.info output
return